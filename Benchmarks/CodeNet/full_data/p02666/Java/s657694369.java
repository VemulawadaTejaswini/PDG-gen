import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Main {
    private static class Town {
        int id = 0;
        int request = -1;
        private List<Road> roads = new ArrayList<Road>();

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof Town) {
                return this.id == ((Town)obj).id;
            } else {
                return false;
            }
        }
    }
    private static class Road {
        private Town town1;
        private Town town2;
    }

    public static void main(String[] args) throws Exception {
        LinkedHashMap<Integer, Town> townList = new LinkedHashMap<Integer, Town>();
        List<Road> roadList = new ArrayList<Road>();
        List<Town> townNoplan = new ArrayList<Town>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int N = Integer.parseInt(reader.readLine().trim());
            String line = reader.readLine();
            String[] tokens = line.split(" +");
            for (int i = 0; i < tokens.length; i++) {
                Town t = null;
                if (townList.containsKey(i + 1)) {
                    t = townList.get(i + 1);
                } else {
                    t = new Town();
                    t.id = i + 1;
                    townList.put(t.id, t);
                }
                t.request = Integer.parseInt(tokens[i]);
                if (t.request != -1) {
                    Town t2 = townList.get(t.request);
                    if (t2 == null) {
                        t2 = new Town();
                        t2.id = t.request;
                        townList.put(t2.id, t);
                    }
                    Road r = new Road();
                    r.town1 = t;
                    r.town2 = t2;
                    t.roads.add(r);
                    t2.roads.add(r);
                    roadList.add(r);
                } else {
                    // 計画がない
                    townNoplan.add(t);
                }
            }
            while (townNoplan.size() > 0) {
                Town t = townNoplan.get(0);
                if (t.roads.size() > 0) {
                    // 別の町から道が引かれているならそのうち1つの町を選ぶ
                    if (t.id != t.roads.get(0).town1.id) {
                        t.request = t.roads.get(0).town1.id;
                    } else {
                        t.request = t.roads.get(0).town2.id;
                    }
                    townNoplan.remove(0);
                } else {
                    // 何処からも道が引かれていない
                    if (townNoplan.size() > 1) {
                        // 他にも予定のない街があるならその街を選ぶ
                        Town t2 = townNoplan.get(1);
                        t.request = t2.id;
                        t2.request = t.id;
                        Road r = new Road();
                        r.town1 = t;
                        r.town2 = t2;
                        t.roads.add(r);
                        t2.roads.add(r);
                        roadList.add(r);
                    } else {
                        // 予定のない街が他にないなら適当に選ぶ
                        Town t2 = townList.get(1);
                        t.request = t2.id;
                        Road r = new Road();
                        r.town1 = t;
                        r.town2 = t2;
                        t.roads.add(r);
                        t2.roads.add(r);
                        roadList.add(r);
                    }
                }
            }
            // 余計な道を消す
            int total = 0;
            for (Town t : townList.values()) {
                for (int i = t.roads.size() - 1; i >= 0; i--) {
                    // 希望の町に他の町からたどり着けるなら直接移動できる道は削除する
                    Road r = t.roads.get(i);
                    Town t2 = r.town1.id != t.id ? r.town1 : r.town2;
                    if (t2.id != t.request) {
                        if (r.town1.id != t.id && search(t.request, t2) != null) {
                            t.roads.remove(i);
                        }
                    }
                }
                total += t.roads.size();
            }
            System.out.println(total % (10000000) );
        };
    }
    private static Town search (int id, Town t) {
        for (int i = 0; i < t.roads.size(); i++) {
            Road r = t.roads.get(i);
            Town t2 = r.town1.id != t.id ? r.town1 : r.town2;
            if (t2.id == id) {
                return t2;
            } else {
                Town t3 = search(id, t2);
                if (t3 != null) {
                    return t3;
                }
            }
        }
        return null;
    }
}
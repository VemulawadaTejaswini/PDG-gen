import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        try {
            String line;

            line = br.readLine();
            while (line != null) {
                StringBuilder sb = new StringBuilder();
                int hit =0;
                int blow = 0;
                LinkedList<Integer> listA = new LinkedList<>();
                LinkedList<Integer> listB = new LinkedList<>();

                st = new StringTokenizer(line);
                listA.add(Integer.parseInt(st.nextToken()));
                listA.add(Integer.parseInt(st.nextToken()));
                listA.add(Integer.parseInt(st.nextToken()));
                listA.add(Integer.parseInt(st.nextToken()));

                line = br.readLine();
                st = new StringTokenizer(line);
                listB.add(Integer.parseInt(st.nextToken()));
                listB.add(Integer.parseInt(st.nextToken()));
                listB.add(Integer.parseInt(st.nextToken()));
                listB.add(Integer.parseInt(st.nextToken()));
                for (int i = 0; i < 4; i++) {
                    if(listB.indexOf(listA.get(i))==i){
                        hit++;
                    }else if(listB.contains(listA.get(i))){
                        blow++;
                    }
                }
                sb.append(hit).append(" ").append(blow);
                System.out.println(sb.toString());
                line = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Main {

        static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws Exception{
            String row;
            while ((row = reader.readLine()) != null) {
                String[] temps = row.split(",");
                int[] cards = new int[5];
                for (int i=0; i<temps.length; i++)
                    cards[i] = Integer.parseInt(temps[i]);

                HashMap<Integer, Integer> dist = new HashMap<Integer, Integer>();

                for (int i=0; i<5; i++) {
                    if (dist.containsKey(cards[i])) {
                        dist.put(cards[i], dist.get(cards[i]) + 1);
                    } else {
                        dist.put(cards[i],  1);
                    } 
                }

                int max_dist = 0;
                Set<Integer> keys = dist.keySet();
                
                for (int key : keys) {
                    if (max_dist < dist.get(key)) {
                        max_dist = dist.get(key);
                    }
                }

                Integer[] a = keys.toArray(new Integer[0]);
                Integer[] p = new Integer[a.length];
                
                for (int i=0; i<a.length; i++)
                    p[i] = dist.get(a[i]);

                Arrays.sort(p);

                if (keys.size() == 3 && max_dist < 3  && p[1] == 2 && p[2] == 2) {
                    max_dist = -3;
                } 
                
                if (keys.size() == 2 && max_dist < 4) {
                    if(p[0] == 2 && p[1] == 3) {
                        max_dist = -1; 
                    }
                }


                if (keys.size() == 5 && max_dist < 4) {

                    boolean flag = true;
                    for (int i=1; i<5; i++) {
                        if (a[i] - a[i-1] != 1) {
                            flag = false;
                        } 
                    }

                    if (a[0] == 1 && a[1] == 10 && a[2] == 11 && a[3] == 12 && a[4] == 13) {
                       flag = true; 
                    }

                    if (flag) {
                        max_dist = -2;    
                    }
                }

                String msg = "";
                switch (max_dist) {
                    case 2:
                        msg = "one pair";
                        break;
                    case -3:
                        msg = "tow pair";
                        break;
                    case 3:
                        msg = "three card";
                        break;
                    case -2:
                        msg = "straight";
                        break;
                    case 4:
                        msg = "four card";
                        break;
                    case -1:
                        msg = "full house";
                        break;
                    default:
                        msg = "null";
                        break;
                }
                
                System.out.println(msg);

            }
        }

}
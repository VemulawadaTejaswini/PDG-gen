import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        try {
            String line;
            while (true) {
                int n = Integer.parseInt(br.readLine());
                if (n == 0) {
                    break;
                }
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {

                    int m = Integer.parseInt(br.readLine());
                    list.add(m);
                }

                for (int i = 0; i < list.size() - 1; i++) {
                    while (true) {
                        if (list.get(i) * list.get(i + 1) > 0) {
                            list.set(i, list.get(i) + list.get(i + 1));
                            list.remove(i + 1);
                            if (i + 1 == list.size()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                //System.out.println(list);
                if(list.get(0)<0){
                    list.remove(0);
                }
                if(list.get(list.size()-1)<0){
                    list.remove(list.size()-1);
                }
                //System.out.println(list);
                for (int i = 0; i < list.size()-2 ; i+=2) {
                    while (true) {
                        if(list.get(i+1)+list.get(i)>=0 && list.get(i+2)+list.get(i+1)>=0){
                            list.set(i,list.get(i)+list.get(i+1)+list.get(i+2));
                            list.remove(i+1);
                            list.remove(i+1);
                            if (i + 1 == list.size()) {
                                break;
                            }
                        }else{
                            break;
                        }
                    }
                }
                Collections.sort(list);
                System.out.println(list.get(list.size()-1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
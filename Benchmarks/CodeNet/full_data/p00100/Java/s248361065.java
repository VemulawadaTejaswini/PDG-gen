import java.util.*;

public class Main{
    Scanner in = new Scanner(System.in);

    ArrayList<String> select(String[] ary){
        ArrayList<String> list = new ArrayList<>();
        String[] name = new String[ary.length];
        int[] price = new int[ary.length];
        Arrays.fill(name, "NONE");
        for(String s : ary){
            String[] sp = s.split(" ");
            int idx = 0;
            while(!name[idx].equals(sp[0]) && !name[idx].equals("NONE")){
                idx++;
            }
            name[idx] = sp[0];
            price[idx] += Integer.parseInt(sp[1]) * Integer.parseInt(sp[2]);
        }
        for(int i = 0; i < price.length; i++){
            if(name[i].equals("NONE")){
                break;
            }
            if(price[i] >= 1000000){
                list.add(name[i]);
            }
        }
        if(list.size() == 0){
            list.add("NA");
        }
        return list;
    }

    void solve(){
        int n = Integer.parseInt(in.nextLine());
        while(n != 0){
            String[] a = new String[n];
            for(int i = 0; i < n; i++){
                a[i] = in.nextLine();
            }
            ArrayList<String> names = select(a);
            names.forEach(System.out::println);
            n = Integer.parseInt(in.nextLine());
        }
    }
    
    public static void main(String[] args){
        new Main().solve();    
    }
}
import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ary1 = new String[n];
        int ans = 0;
        ArrayList<String> ary2 = new ArrayList<>();
        for (int i =0;i<ary1.length;i++){
            ary1[i]=sc.next();
        }
        for (int i =0;i<ary1.length;i++){
            if(!ary2.contains(ary1[i])){
                ary2.add(ary1[i]);
                ans ++;
            }
        }
        System.out.println(ans);
        }
    }

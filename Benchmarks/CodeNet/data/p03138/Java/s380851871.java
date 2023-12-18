import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N =sc.nextInt();
        long K = sc.nextInt();
        ArrayList<Long> List = new ArrayList<>();
        long num=0;
        for(int a=0;a<N;a++)List.add(sc.nextLong());
        String K_num = Long.toBinaryString(K);
        String max = Long.toBinaryString(Collections.max(List));
        if(K==0) num=0;
        else if(K_num.length()<=max.length()) for(int a=0;a<List.size();a++)num = num^List.get(a);
        else {
            for(int a=0;a<List.size();a++)num = num^List.get(a);
            if(num==0){
                String num_bi = "1";
                for(int a=0;a<max.length();a++)num_bi+="0";
                num = Integer.parseInt(num_bi,2);
            }
            else {
                String num_bi = Long.toBinaryString(num);
                String bi = "1";
                num_bi = bi + num_bi;
                num = Integer.parseInt(num_bi,2);
            }
        }
        long sum=0;
        for(int a=0;a<List.size();a++)sum+=num^List.get(a);
        System.out.println(sum);
    }
}

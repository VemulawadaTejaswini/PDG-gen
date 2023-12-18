import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> OPT = new ArrayList<>();
        int opt_num =0;
        for(int i=0;i<N;i++) List.add(sc.nextInt());
        for(int i=0;i<N;i++){
            int num = 0;
            for(int j=i+1;j<N;j++){
                if((i+1)%(j+1)==0&&List.get(j)==1) num++;
            }
            if(num%2!=List.get(i)){
                OPT.add(i+1);
                opt_num++;
            }
        }
        System.out.println(opt_num);
        for(int i=0;i<OPT.size();i++) {
            System.out.print(OPT.get(i));
            if(i<OPT.size()-1) System.out.print(" ");
        }
        System.out.println();
    }
}

import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            if(List.contains(num)!=true)List.add(num);
        }
        int opt=1;
        if(List.size()==1) opt=List.get(0);
        else{
            for(int i=2;i<Collections.min(List);){
                int num=0;
                ArrayList<Integer> List_B = new ArrayList<>();
                for(int j:List){
                    if(j%i==0){
                        num++;
                        List_B.add(j/i);
                    }
                    else List_B.add(j);
                }
                if(num>=N-1){
                    List.clear();
                    List.addAll(List_B);
                    opt*=i;
                }
                else if(num<N-1) i++;
            }
        }
        System.out.println(opt);
    }
}
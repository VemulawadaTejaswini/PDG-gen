import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = 0;
        ArrayList<Integer> List = new ArrayList<>();
        ArrayList<Integer> List_r = new ArrayList<>();
        for(int i=0;i<5;i++){
            int num = sc.nextInt();
            if(num%10==0) time+=num;
            else {
                List.add(num);
                List_r.add(num%10);
            }

        }

        while(List.size()!=0){
            int num = Collections.max(List_r);
            int num2 = List_r.indexOf(num);
            if(num==0) time+= List.get(num2);
            else{
                if(List.size()!=1)time+= List.get(num2)+(10-num);
                else time+= List.get(num2);
            }
            List.remove(num2);
            List_r.remove(List_r.indexOf(num));
        }
        System.out.println(time);
    }
}

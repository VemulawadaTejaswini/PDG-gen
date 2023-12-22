import java.util.*;

public class Main {

    static int a,b;
    static int sum = 0;

    public static void solve(int currentnum,int currentsum,int currentindex){
        if(currentindex==a){
            if(currentsum==b){
                sum++;
            }
           // System.out.println(currentindex+" "+currentsum);
            return;
        }
        for(int i=currentnum+1;i<=9-a+1+currentindex;i++){
            solve(i,currentsum+i,currentindex+1);

        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        while(true){
            a=sc.nextInt();
            b=sc.nextInt();
            if(a==0&&b==0){
                break;
            }
            sum = 0;
            solve(-1,0,0);
           list.add(sum);
        }
        sc.close();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}


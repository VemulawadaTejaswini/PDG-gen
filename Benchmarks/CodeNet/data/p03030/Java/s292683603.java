import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String>po=new ArrayList<>();
        for(int i=0;i<n;i++){
            String s=sc.next();
            while(s.length()<10)s+="0";
            int a=100-sc.nextInt();
            s+=(a<10)?"0"+a:a;
            s+=","+(i+1);
            po.add(s);
        }
        Collections.sort(po);
        for(int i=0;i<n;i++)
            System.out.println(po.get(i).split(",")[1]);
    }
}

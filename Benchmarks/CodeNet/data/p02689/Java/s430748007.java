import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> h=new ArrayList<>();
        HashMap<Integer,Boolean> isHighest=new HashMap<>();
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            int high=sc.nextInt();
            isHighest.put(i+1,false);
            h.add(high);
        }

        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(h.get(a-1)>h.get(b-1)){
                isHighest.put(a,true);
                isHighest.put(b,false);
            }else{
                isHighest.put(b,true);
                isHighest.put(a,false);
            }

        }

        for(int i=0;i<n;i++){
            if(isHighest.get(i+1).booleanValue()){
                count++;
            }
        }
        System.out.println(count);
    }
}

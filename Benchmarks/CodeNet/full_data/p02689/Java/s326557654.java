import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> h=new ArrayList<>();
        HashMap<Integer,Integer> isHighest=new HashMap<>();
        HashMap<Integer,Boolean> isSame=new HashMap<>();
        int count=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<n;i++){
            int high=sc.nextInt();
            isHighest.put(i+1,high);
            isSame.put(i+1,true);
            h.add(high);
        }

        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ah=h.get(a-1);//8
            int bh=h.get(b-1);//9
            if(ah==bh){
                isSame.put(a,false);
                isSame.put(b,false);
            }
            if(ah>bh){
                if(ah>isHighest.get(b))
                    isHighest.put(b,ah);
            }else{
                if(bh>isHighest.get(a))
                    isHighest.put(a,bh);
            }

        }

        for(int i=0;i<n;i++){
            if(isHighest.get(i+1)==h.get(i)){
                if(isSame.get(i+1).booleanValue()){
                    count++;
                }

            }
        }
        System.out.println(count);
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Po>po=new ArrayList<>();
        for(int i=0;i<n;i++){
            po.add(new Po(sc.nextInt(),i));
        }
        Collections.sort(po,new Comparator<Po>(){
            public int compare(Po a,Po b){
                return a.a-b.a;
            }
        });
        int count=0;
        int countb=0;
        int index=-1;
        for(int i=0;i<po.size();i++){
            if(po.get(i).a==index){
                count++;
            }
            else{
                if(i>0){
                    if(po.get(i).b<po.get(i-1).b){
                        countb++;
                    }
                }
            }
            index=po.get(i).a;
        }
        System.out.println(Math.max(Math.abs(countb-count),count));
        
    }
}
class Po{
    int a,b;
    public Po(int x,int y){
        a=x;
        b=y;
    }
}

import java.util.*; 
public class Main{
    static public void main(String[] args){
        Scanner sc=new Scanner(System.in);
       List<Integer>list=new ArrayList<>();
       int n=sc.nextInt(),m=sc.nextInt(),k=sc.nextInt();
       for(int i=0;i<n+m;i++){
           list.add(sc.nextInt());
       }
       Collections.sort(list);
       int kazu=0,kaisu=0;
       sc.close();
       for(int i=0;i<n+m;i++){
        if(kazu+list.get(i)>k){
            continue;
        }
        else{
            kazu+=list.get(i);
            kaisu++;
        }
       }
      System.out.print(kaisu);
    }
}
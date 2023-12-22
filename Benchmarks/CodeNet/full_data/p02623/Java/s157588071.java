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
       for(int i=0;;i++){
        if(kazu<k){
            kazu+=list.get(i);
            kaisu++;
        }
        else if(kaisu==list.size()){
            break;
        }
        else{
            kaisu--;
        break;
        }
       }
      System.out.print(kaisu);
    }
}
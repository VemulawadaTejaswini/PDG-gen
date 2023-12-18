import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List <String> list = new ArrayList<>();
        for(int i=0;i<N;i++){
            String str = sc.next();
            list.add(str);
        }

        for(int i=0;i<list.size();i++){
      
            for(int j=i+1;j<list.size();j++){
               
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j=0;
                }
            }
        }
        
        System.out.println(list.size());
    }
}
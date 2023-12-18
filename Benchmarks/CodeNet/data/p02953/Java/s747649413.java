import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.next());
        ArrayList<Long> h = new ArrayList<Long>();

        for(int i=0;i<N;i++){
            h.add(Long.parseLong(scan.next()));
        }

        for(int i=0;i<N-1;i++){
            Long l = h.get(i);
            if(h.get(i) > h.get(i+1)){
                h.remove(i);
                h.add(i,l-1);
            }
        }

        int i=0;
        for(i=0;i<N-1;i++){
            if(h.get(i)<=h.get(i+1)){

            }else{
                break;
            }
        }

        if(i==N-1)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}

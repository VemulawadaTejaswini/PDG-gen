import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> al = new ArrayList();
        
        for(int i=0;i<N;i++){
            al.add(sc.nextInt());
        }
        
        int k = 0;
        int idx;
        while(k < al.size()){
            idx = al.lastIndexOf(al.get(k));
            if(idx == k){
                k++;
            }else{
                al.remove(idx);
                al.remove(k);
            }
        }
        
        System.out.println(al.size());
    }
    
}
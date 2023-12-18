import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        


        ArrayList<String> list = new ArrayList<String>();
        for(int i =0; i<a.length();i++){
            String b = String.valueOf(a.charAt(i));
            list.add(b);
        }
        

        boolean threefour = false;

        if(list.get(2).equals(list.get(3))){
            threefour = true;
        }

        boolean fivesix = false;

        if(list.get(4).equals(list.get(5))){
            fivesix = true;
        }

        sc.close();

        if(threefour && fivesix){
            System.out.println("Yes");

        }
        else{
            System.out.println("No");
        }




    }
}
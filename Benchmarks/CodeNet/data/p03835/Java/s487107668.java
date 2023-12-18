import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int x,y,z,k,s,count=0;
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        s = scan.nextInt();
        for(x = 0; x <= k; x++){
            for(y = 0;y<=k;y++){
                if(!(x+y>s)){
                    for(z = 0; z <= k;z++){
                        if(x+y+z == s){
                            count++;
                            //System.out.println("x = " + x + "y =" + y + "z = "+ z);
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

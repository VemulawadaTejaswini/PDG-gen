import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    void run(){
        Scanner sc = new Scanner(System.in);
        TreeSet<String> registeredId = new TreeSet<String>();
        boolean opened = false;

        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            registeredId.add(sc.next());
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++){
            String touchId = sc.next();
            if(registeredId.contains(touchId)){
                if(opened){
                    System.out.println("Closed by " + touchId);
                    opened = false;
                }
                else{
                    System.out.println("Opened by " + touchId);
                    opened = true;
                }
            }
            else{
                System.out.println("Unknown " + touchId);
            }
        }
    }
    public static void main(String[] args) {
        //new AOJ2440().run();
        new Main().run();
    }
}
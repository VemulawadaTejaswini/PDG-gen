import java.io.*;
class Main {
    public static void main(String args[]){
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt(br.readLine());
        if(a>=30){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
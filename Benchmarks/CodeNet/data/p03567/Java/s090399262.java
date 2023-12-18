import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String Str = input.nextLine();
        print(Str);
    }
    private static int Search(String in){
        int result = in.indexOf("AC");
        return result;
    }
    private static void print(String inPut){
        if(Search(inPut) != -1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
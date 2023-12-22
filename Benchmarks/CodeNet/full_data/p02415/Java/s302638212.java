import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        char[] ch = in.toCharArray();
        for(int i = 0; i < in.length(); i ++ ){
            if(ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char)(ch[i] - 'A' + 'a');
            else if(ch[i] >= 'a' && ch[i] <= 'z')
                ch[i] = (char)(ch[i] - 'a' + 'A');
        }
        System.out.println(in.valueOf(ch));
    }
}

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []Current=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String []Future=new String[]{"D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","A","B","C"};
        String st=sc.next();
        for(int i = 0;i < st.length(); i++) {
            for(int j = 0; j < Current.length; j++) {
                if(st.charAt(i) == Future[j].charAt(0)) {
                    System.out.print(Current[j]);
                    break;
                }
            }
        }
        System.out.println();
    }

}
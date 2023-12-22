import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Sts = sc.nextLine();
        int l = Sts.length();
        int i,j;
        for(i=0;i<'Z'-'A'+1;i++){
            int count = 0;
            for(j=0;j<l;j++){
                if(Sts.charAt(j) == 'a'+i || Sts.charAt(j) == 'A'+i) count++;
            }
            System.out.printf("%c : %d\n", i+'a',count);
        }
    }
}

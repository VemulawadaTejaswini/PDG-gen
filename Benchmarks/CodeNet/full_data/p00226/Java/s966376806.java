import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char temp1[],temp2[];
        int hit, blow;
        while (sc.hasNext()){
            temp1 = sc.next().toCharArray();
            temp2 = sc.next().toCharArray();
            if (temp1.length==1&&temp2.length==1&&temp1[0]=='0'&&temp2[0]=='0')break;
         
            hit = 0;
            blow=0;
            for (int i=0;i<4;i++) {
                if (temp1[i]==temp2[i])hit++;
                
            }
            for (int i=0;i<4;i++) {
                for (int j=0;j<4;j++) {
                    if (i!=j&&temp2[i]==temp1[j])blow++;
                }
            }
            System.out.println(hit + " " + blow);
        }
    }
}
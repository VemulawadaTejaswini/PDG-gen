
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        int c = sc.nextInt();

        String[] s = new String[a];

        int i;


        for(i=0;i < a;i++)
            s[i]=b.substring(i,i+1);

        String d = s[c-1];

        for(int j=0;j+1 <= a;j++){
            if(s[j].equals(d)){
                s[j]=s[j];
            }else{
                s[j]="*";
            }

        }

        String e = Arrays.toString(s);
        String f = e.replace(",","");
        String g = f.replace("[","");
        String h = g.replace("]","");
        String l = h.replaceAll(" ","");

        System.out.println(l);
    }
}
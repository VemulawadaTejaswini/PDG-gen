import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String p, s;
        p= sc.next();
        s= sc.next();
        String st=p+p; 
        int result = st.indexOf(s);
        if(result==-1)System.out.println("No");
        else System.out.println("Yes");
    }
}

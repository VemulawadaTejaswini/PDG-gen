import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        HashSet<String> h=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!h.contains(s[i]))
                h.add(s[i]);
        }
        System.out.println(h.size());
    }
}


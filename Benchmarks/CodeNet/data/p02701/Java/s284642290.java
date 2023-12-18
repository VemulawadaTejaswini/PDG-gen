import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        ArrayList l= new ArrayList();
        boolean t;
        String line;
        for(int i=0;i<n;i++){
            t=true;
            line=s.nextLine();
            for(int x=0;x<l.size();x++){
                if(l.get(x).equals(line)){
                    t=false;
                    break;
                }
            }
            if(t) l.add(line);
            
        }
        System.out.println(l.size());
    }
}

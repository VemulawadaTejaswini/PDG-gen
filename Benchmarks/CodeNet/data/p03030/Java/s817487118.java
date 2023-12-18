import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();
        String[] si = new String[n];
        ArrayList<String> s = new ArrayList<String>();
        int[] a = new int[n];
        
        for(int i=0; i<n; i++){
            si[i] = sc.next();
            s.add(si[i]);
            a[i] = sc.nextInt();
        }
        
        Collections.sort(s);
        int[] icount = new int[n];
        
        for(int i=0; i<n; i++){
            while(s.get(i)==s.get(i+1)){
                icount[i]++;
            }
            i++;
        }
        
        
        for(int i=0; i<n; i++){
            System.out.print(s.get(i));
            System.out.println(a[i]);
        }

        //System.out.println(ans);
        
	}
}
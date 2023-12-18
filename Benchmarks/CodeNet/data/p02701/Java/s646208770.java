import java.util.*;
 
class Main {
 
    public static void main (String args[])
    {
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        in.nextLine();
        List<String> list = new ArrayList<String>();
        
        
        while(n>0){
            
            String s = in.nextLine();
            n--;
            if(list.contains(s))  continue;
            list.add(s);
            
        }
        System.out.println(list.size());
        
    }
}
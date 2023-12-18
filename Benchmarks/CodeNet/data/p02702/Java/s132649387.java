import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        
        int counter = 0;
        
        for(int i = 0; i + 5 <= data.length(); i++)
        {
            int buf = Integer.parseInt(data.substring(i,i + 5));
            if(buf % 2019 == 0)
            {
                counter++;
            }
        }
        
        for(int i = 0; i + 6 <= data.length(); i++)
        {
            int buf = Integer.parseInt(data.substring(i,i + 6));
            if(buf % 2019 == 0)
            {
                counter++;
            }
        }
        
        for(int i = 0; i + 7 <= data.length(); i++)
        {
            int buf = Integer.parseInt(data.substring(i,i + 7));
            if(buf % 2019 == 0 && buf < 200000)
            {
                counter++;
            }
        }
        
        
        System.out.println(counter);
    }
}

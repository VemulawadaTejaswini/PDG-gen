/**
 *
 * @author Ivan
 */
public class Main {
    
   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int size = scan.nextInt();
        int[] status = new int[size];
        int[] jumps = new int[size];
        
        scan.nextLine();
        String[] input = scan.nextLine().split(" ");
        
        for(int i = 0; i < size; i++) jumps[i] = Integer.parseInt(input[i]);
        
        status[0] = 0;
        status[1] = Math.abs(jumps[0] - jumps[1]);
        
        for(int i = 2; i < size; i++)
            status[i] = Math.min(Math.abs(jumps[i] - jumps[i - 1]) + status[i - 1], Math.abs(jumps[i] - jumps[i - 2]) + status[i - 2]);
        System.out.println(status[size - 1]);
    }
    
}
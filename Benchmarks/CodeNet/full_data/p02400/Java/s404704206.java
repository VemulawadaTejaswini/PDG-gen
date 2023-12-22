 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0;
        r = sc.nextInt();
        
        System.out.printf("%f  %f",r * r * Math.PI, 2.0 * r * Math.PI);
        
    }
    
}

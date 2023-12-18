public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[]a = new int[N];
        for(int i=0; i<a.length; i++) {
        	a[i] = sc.nextInt();
        }
        sc.close();
        int sum = 0;
        for(int i=0; i<a.length; i++) {
        	sum += a[i];
        }   
        double ave = (double)sum/N;
        double minGap = Math.abs(ave-a[0]);
        int minIndex = 0;
        for(int i=0; i<a.length; i++) {
        	if (minGap > Math.abs(ave-a[i])) {
        		minGap = Math.abs(ave-a[i]);
        		minIndex = i;
        	}
        } 
        System.out.println(minIndex);
    }
}
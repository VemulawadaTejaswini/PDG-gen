public class Main{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##,###.##");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= a-(b*2);
		System.out.println(a+""+ c);
	}
}

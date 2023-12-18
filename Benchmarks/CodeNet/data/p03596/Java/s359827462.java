import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		String b = scan.nextLine();
		
		b = scan.nextLine();

		//String c[] ;//= b.split("1");

		//int d[] = new int[c.length];

		b=b.replace(" ", "");
		int cost=0,count=0;
		String sra;
		for(int i=1;;i++) {
			cost = 0;
			String c[] = b.split(String.valueOf(i));
			if(c.length == 1) {
				break;
			}else {
				if(b.charAt(b.length()-1) - '0' == i) {
					count +=(i+1)/2;
				}
				if(b.charAt(0) - '0' == i) {
					count +=(i+1)/2;
				}
			}
			for(int j=0;j<c.length;j++) {

				//b=String.join(c);
				if(c[j].length() == 1){
					count +=(Integer.parseInt(c[j])+1)/2;
					c[j] = "";
					cost+=i-1;
				}if(c[j].length() == 2){

					if(c[j].charAt(0) < c[j].charAt(1)) {
						sra = c[j].substring(1,2);
					}
					else {
						sra = c[j].substring(0, 1);
					}

					count +=(Integer.parseInt(sra)+1)/2;
					c[j] = "";
					cost +=i-1;
				}

			}
			b=String.join(",",c);
			b=b.replace(",", "");
			count += cost;
			//a = Integer.parseInt(c[i]);

		}

		/*for (int seiseki: d){
			  System.out.println(seiseki);
		}*/

		System.out.println(count);


	}

}
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		try{String line1 = scanner.next();
			String line2 = scanner.next();
			String line3 = scanner.next();

			int a =Integer.parseInt(line1);
			int b =Integer.parseInt(line2);
			int c =Integer.parseInt(line3);
			int num []=new int[3];
			int i,j,temp;
			num[0]=a;
			num[1]=b;
			num[2]=c;
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					if(num[i]<num[j]){
						temp=num[i];
						num[i]=num[j];
						num[j]=temp;
					}
				}
			}
			for(int nums:num)
				System.out.print(nums+" ");
				System.out.println("");
			scanner.close();

		}
		 	catch (NumberFormatException e) {
			 System.out.println("??°????????¢????????£????????????????????????");
			 }


	}

}
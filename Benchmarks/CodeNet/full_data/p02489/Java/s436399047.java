import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new  Scanner(System.in);
		try{


			int num []=new int[1000];
			int i,j;
			i=0;
			while(true){
				String line = scanner.nextLine();
				num[i]=Integer.parseInt(line);
				if(num[i]==0)
					break;
				i++;

			}

			for(j=0;j<i;j++)
				System.out.println("Case "+(j+1)+": "+num[j]);

				scanner.close();

		}
		 	catch (NumberFormatException e) {
			 System.out.println("??°????????¢????????£????????????????????????");
			 }


	}

}
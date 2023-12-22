import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws Exception{

	 Scanner in = new Scanner(System.in);

	     //??\???
		 String Line = "";
		 boolean end = true;

		 int count=0;
		 while(in.hasNext()){
			 String str = in.nextLine();
			 //String str = in.next();
			 Line = Line + str;
			 
			 if(".".equals(str)){
					 break;
				 }
			 
			 count++;
		 }

		 //???????????????
		 Line = Line.trim();
		 String[] line = Line.split("\\.");

		 //??????????§?

		 for(int j=0;j<line.length;j++){

			 String[] str = line[j].split("");

			 boolean flag=true;
			 int l=str.length-1;


			 for(int i=0;i<l;i++){

				 switch(str[i]){

				 case "(":
					 flag=false;
					 while(i<l){
						 if(")".equals(str[l])){
							 flag=true;
							 break;
						 }
						 l--;
					 }
					 break;

				 case "[":
					 flag=false;
					 while(i<l){
						 if("]".equals(str[l])){
							 flag=true;
							 break;
						 }
						 l--;
					 }
					 break;

				 default:
					 break;

				 }

			 }
			 System.out.println(flag ? "yes" : "no");
			 flag=true;


		 }

	}

}
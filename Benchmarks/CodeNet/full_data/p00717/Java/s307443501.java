
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


	 static int beforeY=0;
	 static int beforeX=0;
	 static int currentdirection=0;
	 static ArrayList<String> Standard  = new ArrayList();
	 static ArrayList<String> reverseStandard  = new ArrayList();

	 public static void main(String[] args)throws Exception{

	 Scanner sc = new Scanner(System.in);


	 while(true)
	 {
		 int m = sc.nextInt();
		 if(m == 0)
			 return;

		 //????????¨????????????????????\???
		 int standard_num = sc.nextInt();
		 int[][] standardArray = new int[2][standard_num];

		 for(int i=0;i<standard_num;i++)
		 {
			 standardArray[0][i] =sc.nextInt();
		     standardArray[1][i] =sc.nextInt();
		 }

		 for(int i=0;i<standard_num;i++){
			 Standard.add(derive(standardArray[0][i],standardArray[1][i],i));
		 }
		 Standard.remove(0);

		 beforeY=standardArray[0][standard_num - 1];
		 beforeX=standardArray[1][standard_num-1];

		 for(int i=1;i<standard_num;i++){
			 reverseStandard.add(derive(standardArray[0][standard_num - i -1],standardArray[1][standard_num - i -1],i));
//			 System.out.println(standardArray[0][standard_num - i -1]+":"+standardArray[1][standard_num - i -1]+":"+currentdirection+":"+reverseStandard.get(i-1 ));

		 }

//		 System.out.println(reverseStandard);

		 ArrayList<String>[] list = new ArrayList[m];
		 for (int i = 0; i < m; i++) {
			 list[i] = new ArrayList();
		 }


		 for(int m_i=0;m_i<m;m_i++)
		 {
			 beforeY=0;
			 beforeX=0;
			 currentdirection=0;

			 int  n = sc.nextInt();
			 for(int i=0;i<n;i++){
				 int y = sc.nextInt();
				 int x = sc.nextInt();
				 //????????????
				 list[m_i].add(derive(y,x,i));

			 }
			 list[m_i].remove(0);
			// System.out.println(""+ m_i + "??????");
			// System.out.println(list[m_i]);
		 }

		 //?????´????????????????????¨??????????????????

		 for(int m_i=0;m_i<m;m_i++)
		 {
			 int i;
			 for(i=0;i<Standard.size();i++){
				 if( !(Standard.get(i).equals(list[m_i].get(i) ) )   )
				   break;
			 }

			 int j;
			 for(j=0;j<Standard.size();j++){
				 if( !(reverseStandard.get(j).equals(list[m_i].get(j) ) )   )
				   break;
			 }

			 if(i == Standard.size() || j == Standard.size())
				 System.out.println(m_i+1);

		 }
		 System.out.println("+++++");

	 }

	 }


	 private static String derive(int y,int x,int i){

		 int height =  y - beforeY;
		 int width =  x  - beforeX;;

		 int distance = Math.abs(height + width);

		 //???1??????2??????3??????4
		 //??¶?????????????±???????
		 int absolutedirection = absoluteDirection(height,width);

		 //????????????????±???????
		 int reratedirection;
		 int reversedirection;
		 if(i == 1){
			 reratedirection = rerateDirection(absolutedirection,absolutedirection);
		 }
		 else
		 {
			 reratedirection = rerateDirection(currentdirection,absolutedirection);

		 }
		 beforeY = y;
		 beforeX=x;
		 currentdirection = absolutedirection;

		 return "" + reratedirection + "," + distance;

	 }

	 private static int reverse(int direction)
	 {

		 if(direction == 2)
			 direction = 4;
		 else if(direction !=0)
			 direction =(direction + 2) % 4;

		 return direction;
	 }

	 private static int rerateDirection(int currentdirection,int absolutedirection)
	 {
		 int rerate= 0;

		 switch(currentdirection){

		 case 1:
			 rerate = absolutedirection;
			 break;
		 case 2:
			 rerate = (currentdirection + absolutedirection) + 1;
			 if(rerate > 4)
				 rerate -=4;
			 break;
		 case 3:
			 rerate = (currentdirection + absolutedirection - 1 );
			 if(rerate >4)
				 rerate -=4;
			 break;
		 case 4:
			 rerate = (currentdirection + absolutedirection - 3 );
			 if(rerate>4)
				 rerate-=4;
			 break;
		 }

		 

		 return rerate;
	 }


	 //???1??????2??????3??????4
	 private static int absoluteDirection(int height,int width){

		 int direction = 0;

		 if(height > 0)
			 direction = 1;
		 if(height < 0)
			 direction = 3;
		 if(width > 0)
			 direction = 2;
		 if(width < 0)
			direction = 4;

		 return direction;
	 }


}
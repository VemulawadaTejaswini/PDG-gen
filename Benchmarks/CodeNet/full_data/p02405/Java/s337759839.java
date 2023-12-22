class Main
{
	public static void main(String[]args)
	{
		boolean b1=false;
		for(int W=0; W<10; W++){
			for(int H=1; H<10; H++){
				if(b1==false){
					System.out.print("#");
					b1=true;
				}
				else{
					System.out.print(".");
					b1=false;
				}
			}
		System.out.print("\n");		
		}
	}
}
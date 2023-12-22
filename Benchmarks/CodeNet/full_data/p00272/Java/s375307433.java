class Main{
	public void run(){
		Scanner sc = new Scanner(System.in);
		for( int i = 0; i < 4; i++){
			int nType = sc.nextLine();
			int nNum = sc.nextLine();
			switch(nType){
				case 1: System.out.println(6000*nNum); break;
				case 2: System.out.println(4000*nNum); break;
				case 3: System.out.println(3000*nNum); break;
				case 4: System.out.println(2000*nNum); break;
			}
		}
	}
	
	public static void main(String[] args){	new Main().run();}
	
}
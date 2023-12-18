public static void main(String[] args) {
		if(args[0].length() == 2){
			System.out.println(args[0]);
		}else{
            System.out.print(args[0].charAt(2));
            System.out.print(args[0].charAt(1));
            System.out.println(args[0].charAt(0));
        }
 
}
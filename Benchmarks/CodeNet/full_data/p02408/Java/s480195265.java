import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] MainCard = new int[4][13];
        for(int num=0;num<n;num++){
       	 String Mark = sc.next();
        	int a = sc.nextInt();
        	int i = 0;
       	 if(Mark.equals("S")){
           	 i = 0;
       	 }else if(Mark.equals("H")){
           	 i = 1;
        	}else if(Mark.equals("C")){
           	 i = 2;
      	  }else{
        	 i = 3;
       	 }
       		 int j = a-1;
       	 MainCard[i][j] = 1;
       	 }
        	for(int i=0;i<4;i++){
                for(int j=0;j<13;j++){
                    if(MainCard[i][j] == 0){
                        if(i == 0){
                            System.out.println("S " + (j+1));
                        }else if(i == 1){
                            System.out.println("H " + (j+1));
                        }else if(i == 2){
                            System.out.println("C " + (j+1));
                        }else{
                            System.out.println("D " + (j+1));
                        }
                    }
                }
            }
                    
    }
    
}
  

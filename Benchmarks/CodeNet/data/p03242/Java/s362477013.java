import.java.sql.*;
class main{
  int N;
  
  N=Scanner.nextInt();
  int M=N;
  if(N%100=1){
   M+=800;
    }
  if(N%100=9){
   M-=800;
    }
  N/=10;
  if(N%10=9){
   M-=800;
    }
  if(N%10=1){
   M+=800;
    } 
  N/=10;
  if(N=9){
   M-=8;
    }
  if(N=1){
   M+=8;
    }
  System.out.println(M);
  }
}
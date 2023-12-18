import java.util.Scanner;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int m = sc.nextInt();
  int[] a = new int[10];
  for(int i = 0;i < m;i++){
    int p = sc.nextInt();
    a[p] = 1;
  }
  int[] ans = new int[10];
  //1
  if(a[1] == 1){
    if(n%2 == 0)ans[1] = n/2;
    else if(a[7] == 1){
      ans[1] = n/2;
      ans[7] = 1;
    }
    else if(a[5] == 1){
      ans[1] = (n-3)/2;
      ans[5] = 1;
    }
    else if(a[3] == 1){
      ans[1] = (n-3)/2;
      ans[3] = 1;
    }
    else if(a[2] == 1){
      ans[1] = (n-3)/2;
      ans[2] = 1;
    }
    else if(a[8] == 1){
      ans[1] = (n-5)/2;
      ans[8] = 1;
    }
  }
  //7
  else if(a[7] == 1){
    if(n%3 == 0)ans[7] = n/3;
    else{
      int p = n%3;
      if(p == 1){
        if(a[4]==1){
          ans[4] = 1;
          ans[7] = (n-4)/3;
        }
        else if(a[8]==1){
          ans[8]=1;
          ans[7]=(n-7)/3;
        }
        else if(a[5]==1){
          ans[5]=2;
          ans[7]=(n-10)/3;
        }
        else if(a[3]==1){
          ans[3]=2;
          ans[7]=(n-10)/3;
        }
        else if(a[2]==1){
          ans[2]=2;
          ans[7]=(n-10)/3;
        }
      }
      else if(p == 2) {
    	  if(a[5]==1){
              ans[5]=1;
              ans[7]=(n-5)/3;
            }
            else if(a[3]==1){
              ans[3]=1;
              ans[7]=(n-5)/3;
            }
            else if(a[2]==1){
              ans[2]=1;
              ans[7]=(n-5)/3;
            }
            else if(a[4]==1){
                ans[4]=2;
                ans[7]=(n-8)/3;
              }
            else if(a[8]==1){
                ans[8]=2;
                ans[7]=(n-14)/3;
              }
      }
    }
  }
  //4
  else if(a[4]==1) {
	  int p = n%4;
	  if(p==0)ans[4] = n/4;
	  else if(p == 1) {
		  if(a[5]==1){
              ans[5]=1;
              ans[4]=(n-5)/4;
            }
            else if(a[3]==1){
              ans[3]=1;
              ans[4]=(n-5)/4;
            }
            else if(a[2]==1){
              ans[2]=1;
              ans[4]=(n-5)/4;
            }
            else {
            	if(a[9] == 1) {
            		ans[9] = 1;
            		ans[8] = 1;
            		ans[4] = (n-13)/4;
            	}
            	else if(a[6] == 1) {
            		ans[6] = 1;
            		ans[8] = 1;
            		ans[4] = (n-13)/4;
            	}
            	else {
            		ans[8] = 3;
            		ans[4] = (n-21)/4;
            	}
            }
	  }
	  else if(p == 3) {
		  if(a[8]==1){
              ans[8]=1;
              ans[4]=(n-7)/4;
            }
            else {
            	int q;
          	  if(a[5]==1)q=5;
          	  else if(a[3]==1)q=3;
          	  else q=2;
            	if(a[9] == 1) {
            		ans[9] = 1;
            		ans[q] = 1;
            		ans[4] = (n-11)/4;
            	}
            	else if(a[6] == 1) {
            		ans[6] = 1;
            		ans[q] = 1;
            		ans[4] = (n-11)/4;
            	}
            	else {
            		ans[q] = 3;
            		ans[4] = (n-15)/4;
            	}
            }
	  }
	  else {
		  if(a[9] == 1) {
			  ans[9] = 1;
			  ans[4] = (n-6)/4;
		  }
		  else if(a[6] == 1) {
			  ans[6] = 1;
			  ans[4] = (n-6)/4;
		  }
		  else if(a[2]==1 || a[3] == 1||a[5]==1){
			  int q;
          	  if(a[5]==1)q=5;
          	  else if(a[3]==1)q=3;
          	  else q=2;
          
          	  ans[q] = 2;
          	  ans[4] = (n-10)/4;
		  }
		  else {
			  ans[8] = 2;
			  ans[4] = (n-14)/4;
		  }
	  }
  }
  //5 or 3 or 2
  else if(a[2]==1 || a[3] == 1||a[5]==1) {
	  int q;
  	  if(a[5]==1)q=5;
  	  else if(a[3]==1)q=3;
  	  else q=2;
  	  int p = n%5;
	  if(p==0)ans[q]=n/5;
	  else if(p==1) {
		  if(a[9]==1) {
			  ans[9]=1;
			  ans[q]=(n-6)/5;
		  }
		  else if(a[6]==1) {
			  ans[6]=1;
			  ans[q]=(n-6)/5;
		  }
		  else {
			  ans[8]=3;
			  ans[q]=(n-21)/5;
		  }
	  }
	  else if(p == 2) {
		  if(a[8] == 1) {
			  ans[8]=1;
			  ans[q]=(n-7)/2;
		  }
		  else if(a[9]==1) {
			  ans[9]=2;
			  ans[q]=(n-12)/5;
		  }
		  else if(a[6]==1) {
			  ans[6]=2;
			  ans[q]=(n-12)/5;
		  }
		  }
	  else if(p == 3) {
		  if(a[6]==1 ||a[9]==1) {
			  int h;
			  if(a[9]==1)h = 9;
			  else h = 6;
			  if(a[8] ==1) {
				  ans[8]=1;
				  ans[h]=1;
				  ans[q]=(n-13)/5;
			  }
			  else {
				  ans[h] = 3;
				  ans[q]=(n-18)/5;
			  }
		  }
		  else {
			  ans[8] = 4;
			  ans[q] = (n-28)/5;
		  }
	  }
	  else {
		  if(a[8] == 1) {
			  ans[8]=2;
			  ans[q]=(n-14)/5;
		  }
		  else {
			  int h;
			  if(a[9]==1)h = 9;
			  else h = 6;
			  if(a[8]==1) {
				  ans[8]=1;
				  ans[h]=2;
				  ans[q]=(n-19)/5;
			  }
			  else {
			  ans[h] = 4;
			  ans[5] = (n-24)/5;
			  }
		  }
	  }
  }
  //6 or 9
  else if(a[6]==1 || a[9]==1) {
	  int h;
	  if(a[9]==1)h = 9;
	  else h = 6;
	  int p = n%6;
	  if(p==0)ans[h]=n/6;
	  else if(p==1) {
		  a[8] = 1;
		  a[h] = (n-7)/6;
	  }
	  else if(p==2) {
		  a[8] = 2;
		  a[h] = (n-14)/6;
	  }
	  else if(p==3) {
		  a[8] = 3;
		  a[h] = (n-21)/6;
	  }
	  else if(p==4) {
		  a[8] = 4;
		  a[h] = (n-28)/6;
	  }
	  else if(p==5) {
		  a[8] = 1;
		  a[h] = (n-35)/6;
	  }
  }
  else ans[8] = n/8;
  ans[0] = 0;
  for(int i = 9;i >= 0;i--) {
	  for(int j = 0;j < ans[i];j++) {
		  System.out.print(i);
	  }
  }
  System.out.println("");
}}
      
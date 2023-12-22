#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<math.h>

void push(int);
int pup();

int atama;
int A[199];

int main(int argc, char *argv[]){
  int x,y;
  char a[100];
  
  atama=0;
  
  while(scanf("%s",a)!=EOF){
    if(a[0]=='+'){
      x=pop();
      y=pop();
      push(x+y);
    }
    else if(a[0]=='-'){
      y=pop();
      x=pop();
      push(x-y);
    }
    else if(a[0]=='*'){
      x=pop();
      y=pop();
      push(x*y);

    }
    else {
      push(atoi(a));
    }
  }

  printf("%d\n",pop());

  return 0;

}

void push(int a){
  A[++atama]=a;
}

int pop(){
  atama--;
  return A[atama+1];
}
    


/* ABC145-B
   Takatan */

#include<stdio.h>
#include<stdlib.h>
int main(void){
    int length, i;
    char string[101];

    scanf( "%d" , &length);
    scanf( "%s" , string);

    for(i=0; i < length/2; i++){
        if(string[i]!=string[length/2+i] || length%2==1){
            printf( "No\n" );
            return 0;
        }
    }
    printf( "Yes\n" );
    return 0;
}
using namespace std;  
   
int m,n,num[26]; char s[100009];  
int main(){  
    scanf("%d%d",&m,&n);  
    int s1=(m>>1)*(n>>1),s2=(m&1)*(n>>1)+(m>>1)*(n&1),s3=m&n&1;  
    int i,j;  
    for (i=1; i<=m; i++){  
        scanf("%s",s+1);  
        for (j=1; j<=n; j++) num[s[j]-'a']++;  
    }  
    for (i=0; i<26; i++){  
        while (num[i]>=4 && s1){ num[i]-=4; s1--; }  
        while (num[i]>=2 && s2){ num[i]-=2; s2--; }  
        while (num[i] && s3){ num[i]--; s3--; }  
        if (num[i]) break;  
    }  
    puts(i<26?"No":"Yes");  
    return 0;  
}
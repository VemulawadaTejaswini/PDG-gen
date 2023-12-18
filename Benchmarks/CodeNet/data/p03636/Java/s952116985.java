#include<iostream>
using namespace std;
int main()
{
    string s;
    cin>>s;

    int count = 0;



    for (int i = 2; i < s.length(); i++)
    {
        count++;
    }
    cout<<s[0]<<count<< s[s.length()-1];

}


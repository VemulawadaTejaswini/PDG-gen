#include <iostream>
using namespace std;
int _move[8][2] = {-1,-1,0,-1,1,-1,-1,0,1,0,-1,1,0,1,1,1,};
int main( )
{
    int h,w;
    cin>>h>>w;
    char _map[55][55];
    for(int i = 0; i<52; i++)
    {
        _map[0][i]='.';
        _map[i][0]='.';
    }
    for(int i = 1; i<=h; i++)
    {
        for(int j = 1; j<=w; j++)
        {
            cin>>_map[i][j];
        }
    }
    for(int i = 1; i<=h; i++)
    {
        for(int j = 1; j<=w; j++)
        {
            if(_map[i][j]=='.')
            {
                _map[i][j]='0';
                for(int x=0; x<8; x++)
                {
                    if(_map[i+_move[x][0]][j+_move[x][1]]=='#')
                    {
                        _map[i][j]++;
                    }
                }
            }
        }
    }
    for(int i = 1; i<=h; i++)
    {
        for(int j = 1; j<=w; j++)
        {
            cout<<_map[i][j];
        }
        cout<<endl;
    }
    return 0;
}
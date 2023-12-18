n,inc,dec=int(input()),[],[]
for _ in range(n):
  s,d,r=input(),0,0
  for c in s:
    d=d+(1 if c=='(' else -1)
    r=max(r,-d)
  (dec if d<0 else inc).append((d,r))
inc.sort(key=lambda x:x[1])
dec.sort(key=lambda x:x[0]+x[1])
p1,p2,ok=0,0,True
for s in inc:
  ok&=s[1]<=p1
  p1+=s[0]
for s in dec:
  ok&=p2>=s[0]+s[1]
  p2-=s[0]
ok&=p1==p2
print('Yes'if ok else'No')
    

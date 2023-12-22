def main
  if true then
    fh=STDIN
  else
    fh=open("in1_0138.txt")
  end

  rec=[]
  while fh.gets do
    f = $_.chomp.split
    id=f[0].to_i
    tm=f[1].to_f
    rec.push([id, tm])
  end
  ans=[]
  g1=rec[0..7].sort{|a,b| a[1]<=>b[1]}
  g2=rec[8..15].sort{|a,b| a[1]<=>b[1]}
  g3=rec[16..23].sort{|a,b| a[1]<=>b[1]}
  ans = g1.take(2) + g2.take(2) + g3.take(2) + (g1.drop(2) + g2.drop(2) + g3.drop(2)).sort{|a,b| a[1]<=>b[1]}.take(2)
  ans.each{|id,tm| printf("%d %.2f\n", id, tm)}

end

if $0==__FILE__ then
  main
end